
class Station():
    def __init__(self):
        self.box = None
        pass

    def __str__(self):
        if self.box is None:
            return 'XXXX'
