public final class CellPhone extends Product {

    public CellPhone() {
        super("Cell Phone", 2000.00);
    }

    @Override
    public String getCategory() {
        return "Cell Phone";
    }
}