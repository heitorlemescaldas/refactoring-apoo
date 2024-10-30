package br.edu.ifsp;

public class ToolItem extends DomainObject {
    private String serialNumber;
    private Tool tool;

    public ToolItem(String serialNumber, Tool tool) {
        this.serialNumber = serialNumber;
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
