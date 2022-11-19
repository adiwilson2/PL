from typing import List

from wilson_adeline.Belt import Belt
from wilson_adeline.Station import Station


class Conveyer:

    def __init__(self):
        self.default_conveyer = [Belt(), Belt(), Station(), Belt(), Belt(), Station()]

    def __str__(self):
        bot = ''
        for item in self.default_conveyer:
            parts = str(item)
            bot += parts[0]
        return bot

    def add_box(self, box):
        self.default_conveyer[0].add_box(box)
