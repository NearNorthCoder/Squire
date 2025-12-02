/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.client.Static
 */
package net.unethicalite.api.game;

import java.util.function.Supplier;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public static enum GameSettings.Display {
    FIXED(() -> Widgets.get(WidgetInfo.FIXED_VIEWPORT)),
    RESIZABLE_MODERN(() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_MAGIC_TAB)),
    RESIZABLE_CLASSIC(() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_INTERFACE_CONTAINER));

    private final Supplier<Widget> widgetSupplier;

    private GameSettings.Display(Supplier<Widget> widgetSupplier) {
        this.widgetSupplier = widgetSupplier;
    }

    public Supplier<Widget> getWidgetSupplier() {
        return this.widgetSupplier;
    }

    public static void setMode(GameSettings.Display displayMode) {
        if (!Tabs.isOpen(Tab.OPTIONS)) {
            Tabs.open(Tab.OPTIONS);
            Time.sleepUntil(() -> Tabs.isOpen(Tab.OPTIONS), 2000);
        }
        switch (displayMode) {
            case FIXED: {
                GameThread.invoke(() -> Static.getClient().runScript(new Object[]{3998, 0}));
                break;
            }
            case RESIZABLE_MODERN: {
                GameThread.invoke(() -> Static.getClient().runScript(new Object[]{3998, 1}));
                break;
            }
            case RESIZABLE_CLASSIC: {
                GameThread.invoke(() -> {
                    Static.getClient().runScript(new Object[]{441, 7602188, 7602213, 7602207, 7602209, 7602214, 7602215, 0x740000});
                    Static.getClient().interact(1, 57, 2, 7602213);
                });
            }
        }
    }

    public static GameSettings.Display getCurrentMode() {
        for (GameSettings.Display display : GameSettings.Display.values()) {
            Widget widget = display.getWidgetSupplier().get();
            if (!Widgets.isVisible(widget)) continue;
            return display;
        }
        return null;
    }
}
