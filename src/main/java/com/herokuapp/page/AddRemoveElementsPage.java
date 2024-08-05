package com.herokuapp.page;

public class AddRemoveElementsPage {

    String btn_addElement = "//button[contains(text(),'Add Element')]";
    String btn_removeElement = "//button[contains(text(),'Delete')]";

    public String clickBtn_addElement() {
        return btn_addElement;
    }

    public String clickBtn_removeElement() {
        return btn_removeElement;
    }

}
