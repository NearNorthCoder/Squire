/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.ui.ThemeColors;
import squire.ui.ProgressPanel;
import java.awt.Color;
import javax.swing.plaf.basic.BasicProgressBarUI;

class squireDir
extends BasicProgressBarUI {
    final /* synthetic */ z bh;

    squireDir(z z2) {
        this.bh = z2;
    }

    @Override
    protected Color getSelectionForeground() {
        return k.BACKGROUND_COLOR;
    }

    @Override
    protected Color getSelectionBackground() {
        return k.BACKGROUND_COLOR;
    }
}
