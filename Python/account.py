class Account:
    id       = int
    name     = str
    document = str
    email    = str
    password = str

    def _init_(self, name, document):
        self.name = name
        self.document = document