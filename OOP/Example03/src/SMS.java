public class SMS {
    private int empfängerID;
    private String text;

    public SMS(int empfängerID, String text) {
        this.empfängerID = empfängerID;
        this.text = text;
    }

    public int getEmpfängerID() {
        return empfängerID;
    }

    public void setEmpfängerID(int empfängerID) {
        this.empfängerID = empfängerID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
