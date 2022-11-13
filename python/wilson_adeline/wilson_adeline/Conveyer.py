from typing import List

from wilson_adeline.Belt import Belt
from wilson_adeline.Section import Section
from wilson_adeline.Station import Station


class Conveyer:

    def __init__(self):
        self.sections = []

    def default_setup(self):
        default_conveyer: list[Section] = [Belt(2), Station(), Belt(2), Station()]
        self.sections = default_conveyer

    def __str__(self):
        for section in self.sections:
            if isinstance(section, Belt):
                print('----' * section.length)
            elif isinstance(section, Station):
                print('XXXX')



