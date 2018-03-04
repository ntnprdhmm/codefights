def buildCommand(jsonFile):
    import json
    import numbers
    from collections import OrderedDict
    def cleanJSON(root):
        for key, value in root.items():
            if isinstance(value, list):
                root[key] = list()
            elif isinstance(value, numbers.Number):
                root[key] = 0
            elif isinstance(value, str):
                root[key] = str()
            else:
                root[key] = cleanJSON(value)
        return root

    root = cleanJSON(json.loads(jsonFile, object_pairs_hook=OrderedDict))
    return json.dumps(root)
