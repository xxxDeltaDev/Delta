package net.badlion.client.mods;

import net.delta.client.events.Event;

public interface IMod
{
    void onEvent(Event var1);

    void createCogMenu();
}
