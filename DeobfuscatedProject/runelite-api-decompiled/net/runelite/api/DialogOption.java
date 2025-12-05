/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.Arrays;
import javax.annotation.Nullable;

public enum DialogOption {
    NPC_CONTINUE(15138821, -1),
    PLAYER_CONTINUE(14221317, -1),
    QUEST(0xC10000, 0),
    ITEM_ONE(0xC10000, -1),
    ITEM_TWO(0xC10000, 0),
    CHAT_OPTION_ONE(14352385, 1),
    CHAT_OPTION_TWO(14352385, 2),
    CHAT_OPTION_THREE(14352385, 3),
    CHAT_OPTION_FOUR(14352385, 4),
    CHAT_OPTION_FIVE(14352385, 5),
    PLAIN_CONTINUE(15007746, -1),
    PLAIN_CONTINUE_TWO(720900, -1),
    LEVEL_UP_CONTINUE(15269891, -1);

    private final int widgetUid;
    private final int menuIndex;

    private DialogOption(int widgetUid, int menuIndex) {
        this.widgetUid = widgetUid;
        this.menuIndex = menuIndex;
    }

    public int getWidgetUid() {
        return this.widgetUid;
    }

    public int getMenuIndex() {
        return this.menuIndex;
    }

    @Nullable
    public static DialogOption of(int widgetUid, int menuIndex) {
        return Arrays.stream(DialogOption.values()).filter(option -> option.getWidgetUid() == widgetUid && option.getMenuIndex() == menuIndex).findFirst().orElse(null);
    }
}

