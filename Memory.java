class Memory {
    private String model;
    private int size;


    public Memory(String model, int size, String type) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
