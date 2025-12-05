/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.DialogOption;

public final class DialogProcessed {
    private final DialogOption dialogOption;

    public DialogProcessed(DialogOption dialogOption) {
        this.dialogOption = dialogOption;
    }

    public DialogOption getDialogOption() {
        return this.dialogOption;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DialogProcessed)) {
            return false;
        }
        DialogProcessed other = (DialogProcessed)o;
        DialogOption this$dialogOption = this.getDialogOption();
        DialogOption other$dialogOption = other.getDialogOption();
        return !(this$dialogOption == null ? other$dialogOption != null : !((Object)((Object)this$dialogOption)).equals((Object)other$dialogOption));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        DialogOption $dialogOption = this.getDialogOption();
        result = result * 59 + ($dialogOption == null ? 43 : ((Object)((Object)$dialogOption)).hashCode());
        return result;
    }

    public String toString() {
        return "DialogProcessed(dialogOption=" + String.valueOf((Object)this.getDialogOption()) + ")";
    }
}

