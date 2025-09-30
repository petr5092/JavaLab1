class Monitor {
    private String model;
    private double diagonal;

    public Monitor(String model, double diagonal) {
        this.model = model;
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}