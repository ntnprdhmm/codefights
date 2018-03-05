def pageComplexity(document):
    from html.parser import HTMLParser

    class MyHTMLParser(HTMLParser):
        def __init__(self):
            HTMLParser.__init__(self)
            self.counter = {}
            self.depth = 1
            self.max_depth = 1

        def handle_starttag(self, tag, attrs):
            if self.depth not in self.counter:
                self.counter[self.depth] = set()
            self.counter[self.depth] |= {tag}
            self.depth += 1
            self.max_depth = max(self.max_depth, self.depth)

        def handle_endtag(self, tag):
            self.depth -= 1

    parser = MyHTMLParser()
    parser.feed(document)

    print(parser.counter)

    return sorted(list(parser.counter[parser.max_depth-1]))
