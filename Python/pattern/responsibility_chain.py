import logging

logging.basicConfig(level=logging.ERROR)
logger = logging.getLogger("chains")


class Event:
    def __init__(self, event):
        self.event = event

    def __repr__(self):
        return self.event


class Chains:
    def __init__(self, next=None):
        self.next = next

    def handle(self, event):
        attr = "handle_{}".format(event)
        if hasattr(self, attr):
            method = getattr(self, attr)
            method(event)
        elif self.next:
            self.next.handle(event)
        elif hasattr(self, 'handle_default'):
            self.handle_default(event)


class Handler_A(Chains):
    def handle_a(self, event):
        print('Handle event a: running')
        print(event)
        print('Handle close')

    def handle_default(self, event):
        logger.warning("Unhandle event: {}".format(event))


class Handler_B(Chains):
    def handle_b(self, event):
        print('Handle event b: running')
        print(event)
        print('Handle close')


def main():
    h_a = Handler_A()
    h_b = Handler_B(h_a)

    for event in ('a', 'b', 's', 'd'):
        h_b.handle(event)


if __name__ == '__main__':
    main()
