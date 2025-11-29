/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.ui.AuthPanel;
import squire.ui.ThemeColors;
import java.awt.Color;
import javax.swing.plaf.basic.BasicProgressBarUI;

class AuthProgressBarUI
extends BasicProgressBarUI {
    final /* synthetic */ c O;

    @Override
    protected Color getSelectionBackground() {
        return k.BACKGROUND_COLOR;
    }

    @Override
    protected Color getSelectionForeground() {
        return k.BACKGROUND_COLOR;
    }

    d(c c2) {
        this.O = c2;
    }
}
