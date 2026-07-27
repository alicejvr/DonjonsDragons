package fr.campus.dungeoncrawler.Items;

public class Cell {

    private Object cellContent;

    public Cell(Object cellContent) {
        this.cellContent = cellContent;
    }

    public Object getCellContent() {
        return cellContent;
    }

    public void setCellContent(Object cellContent) {
        this.cellContent = cellContent;
    }


}

