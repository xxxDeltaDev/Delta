package net.badlion.client.events.event;

import net.delta.client.events.Event;
import net.delta.client.events.EventType;

public class GUIClickMouse extends Event
{
    private int mouseButton;

    public GUIClickMouse(int mouseButton)
    {
        super(EventType.GUI_CLICK_MOUSE);
        this.mouseButton = mouseButton;
    }

    public int getMouseButton()
    {
        return this.mouseButton;
    }
}
