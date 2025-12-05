/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.grounditems;

import com.google.common.base.Strings;
import com.google.common.cache.CacheLoader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import net.runelite.client.plugins.grounditems.ItemThreshold;
import net.runelite.client.plugins.grounditems.NamedQuantity;
import net.runelite.client.util.WildcardMatcher;

class WildcardMatchLoader
extends CacheLoader<NamedQuantity, Boolean> {
    private final List<ItemThreshold> itemThresholds;

    WildcardMatchLoader(List<String> configEntries) {
        this.itemThresholds = configEntries.stream().map(ItemThreshold::fromConfigEntry).filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public Boolean load(@Nonnull NamedQuantity key) {
        if (Strings.isNullOrEmpty(key.getName())) {
            return false;
        }
        String filteredName = key.getName().trim();
        for (ItemThreshold entry : this.itemThresholds) {
            if (!WildcardMatcher.matches(entry.getItemName(), filteredName) || !entry.quantityHolds(key.getQuantity())) continue;
            return true;
        }
        return false;
    }
}

