def xmlTags(xml):
    def depth_iter(element, tag=None):
        stack = []
        stack.append(iter([element]))
        while stack:
            e = next(stack[-1], None)
            if e == None:
                stack.pop()
            else:
                yield (e, len(stack)-1)
                stack.append(iter(e))

    import xml.etree.ElementTree as ET
    from collections import OrderedDict
    root = ET.fromstring(xml)
    tags = OrderedDict()

    for e, depth in depth_iter(root):
        if e.tag not in tags:
            # add new tag in the OrderedDict
            tags[e.tag] = [depth, set(e.keys())]
        else:
            # update attributes of this tag
            tags[e.tag][1] |= set(e.keys())

    res = []
    for tag, props in tags.items():
        res.append('--'*props[0] + tag + format_attributes(props[1]))
    return res

def format_attributes(attributes):
    return "(" +  ', '.join(sorted(attributes)) + ")"
