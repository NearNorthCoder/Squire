/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api;

import net.runelite.api.Locatable;
import net.unethicalite.api.EntityNameable;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.Interactable;

public interface SceneEntity
extends Locatable,
Identifiable,
Interactable,
EntityNameable {
    public long getTag();
}

