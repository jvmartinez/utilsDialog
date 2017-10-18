package jvmartinez.com.utilsDialog.Emun;

/**
 * Created by Juan Martinez on 18/10/17.
 */

public enum TypeIco {
    ICON_SUCCESS(1),
    ICON_WARNING(2),
    ICON_INFO(3),
    ICON_ERROR(4);
    private final int typeico;

    TypeIco(int typeico) {
        this.typeico = typeico;
    }

    public int getTypeico() {
        return typeico;
    }
}
