package jvmartinez.com.utilsDialog.Utils;

/**
 * Created by Juan Martinez on 20/10/17.
 */

public class Style {
    private int backgroundBody;
    private int backgroundTitle;
    private int backgroundContents;
    private int textTitle;
    private int textBody;
    private int btnOkColor;
    private int btnCancelColor;
    private int textColorButton;
    private int layoutWindows;

    public Style(){

    }

    public Style(int backgroundBody, int backgroundTitle, int backgroundContents, int textTitle, int textBody, int btnOkColor, int btnCancelColor, int textColorButton, int layoutWindows) {
        this.backgroundBody = backgroundBody;
        this.backgroundTitle = backgroundTitle;
        this.backgroundContents = backgroundContents;
        this.textTitle = textTitle;
        this.textBody = textBody;
        this.btnOkColor = btnOkColor;
        this.btnCancelColor = btnCancelColor;
        this.textColorButton = textColorButton;
        this.layoutWindows = layoutWindows;
    }

    public int getBackgroundBody() {
        return backgroundBody;
    }

    public void setBackgroundBody(int backgroundBody) {
        this.backgroundBody = backgroundBody;
    }

    public int getBackgroundTitle() {
        return backgroundTitle;
    }

    public void setBackgroundTitle(int backgroundTitle) {
        this.backgroundTitle = backgroundTitle;
    }

    public int getBackgroundContents() {
        return backgroundContents;
    }

    public void setBackgroundContents(int backgroundContents) {
        this.backgroundContents = backgroundContents;
    }

    public int getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(int textTitle) {
        this.textTitle = textTitle;
    }

    public int getTextBody() {
        return textBody;
    }

    public void setTextBody(int textBody) {
        this.textBody = textBody;
    }

    public int getBtnOkColor() {
        return btnOkColor;
    }

    public void setBtnOkColor(int btnOkColor) {
        this.btnOkColor = btnOkColor;
    }

    public int getBtnCancelColor() {
        return btnCancelColor;
    }

    public void setBtnCancelColor(int btnCancelColor) {
        this.btnCancelColor = btnCancelColor;
    }

    public int getTextColorButton() {
        return textColorButton;
    }

    public void setTextColorButton(int textColorButton) {
        this.textColorButton = textColorButton;
    }

    public int getLayoutWindows() {
        return layoutWindows;
    }

    public void setLayoutWindows(int layoutWindows) {
        this.layoutWindows = layoutWindows;
    }
}
