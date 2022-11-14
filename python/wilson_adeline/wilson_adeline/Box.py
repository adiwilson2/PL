class Box:
    serial_counter = 1

    def __init__(self, num_of_units=10):
        self.num_of_units = num_of_units
        self.max_load = 0
        self.units = 0
        self.serial_number = Box.serial_counter
        Box.serial_counter += 1

    def __str__(self):
        pass

