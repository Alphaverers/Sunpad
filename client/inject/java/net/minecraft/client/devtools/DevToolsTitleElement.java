package net.minecraft.client.devtools;

public class DevToolsTitleElement implements DevToolsElement {

    private final String text;

    public DevToolsTitleElement(String text) {
        this.text = text;
    }

    @Override
    public void render(DevTools screen, int x, int y, boolean selected) {
        screen.drawString(text, x, y, 0x0000FF);
    }

    @Override
    public void select(DevTools screen) {

    }
}
