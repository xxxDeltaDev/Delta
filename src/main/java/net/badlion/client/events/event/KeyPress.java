package net.badlion.client.events.event;

import net.delta.client.events.Event;
import net.delta.client.events.EventType;

public class KeyPress extends Event
{
    private int keyId;
    private boolean pressed;

    public KeyPress(int keyId, boolean pressed)
    {
        super(EventType.KEY_PRESS);
        this.keyId = keyId;
        this.pressed = pressed;
    }

    public int getKeyID()
    {
        return this.keyId;
    }

    public void setPressed(boolean pressed)
    {
        this.pressed = pressed;
    }

    public boolean isPressed()
    {
        return this.pressed;
    }
}
