/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 */
package gg.squire.whisperer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.whisperer.config.SquireWhispererConfig;
import net.runelite.api.Client;
import gg.squire.whisperer.tasks.BHelper;
import gg.squire.whisperer.tasks.WhispererManager;

public abstract class WhispererTaskBase
extends Task {
    @Inject
    protected  b w;
    @Inject
    protected  SquireWhispererConfig i;
    @Inject
    protected  c p;
    @Inject
    protected  Client j;
}

