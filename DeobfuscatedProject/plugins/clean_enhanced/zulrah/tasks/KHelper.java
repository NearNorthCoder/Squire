/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum9;
import com.google.inject.Inject;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

public class KHelper
extends ZulrahTaskBase {

    static {
        K.var2();
    }

    @Override
    public boolean ac() {
        return 0;
    }

    @Inject
    public KHelper(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, c c2) {
        super(squireZulrahConfig, squireZulrah, client, c2);
    }
}

