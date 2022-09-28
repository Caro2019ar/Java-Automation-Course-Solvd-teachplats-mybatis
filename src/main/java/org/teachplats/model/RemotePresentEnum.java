package org.teachplats.model;

public enum RemotePresentEnum {
    REMOTE(1), PRESENT(2);
    private int value;
    RemotePresentEnum(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
