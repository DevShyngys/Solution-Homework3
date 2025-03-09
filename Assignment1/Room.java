package Assignment1;

class Room {
    private final String description;

    public Room(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

