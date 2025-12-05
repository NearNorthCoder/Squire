/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.config;

import gg.squire.client.util.Storage;
import java.util.Collection;
import java.util.List;
import net.runelite.client.config.ConfigSerializer;
import net.runelite.client.config.ConfigStorageBoxSerializer;

@ConfigSerializer(value=ConfigStorageBoxSerializer.class)
public class ConfigStorageBox<T> {
    private String folder;
    private String selected;

    public ConfigStorageBox(String folder, String selected) {
        this.folder = folder;
        this.selected = selected;
    }

    public ConfigStorageBox() {
    }

    public T selected(Class<T> type) {
        return this.storage(type).named(this.selected);
    }

    public Storage.StorageEntry getSelectedEntry() {
        return this.entries().stream().filter(entry -> entry.getName().equals(this.selected)).findFirst().orElse(null);
    }

    public boolean isSelected() {
        return this.selected != null && !this.selected.isEmpty() && !this.selected.equals("None");
    }

    public Storage<T> storage(Class<T> clz) {
        return Storage.of(this.folder, clz).create();
    }

    public Storage raw() {
        return Storage.of(this.folder, Object.class).create();
    }

    public Collection<Storage.StorageEntry> entries() {
        List<Storage.StorageEntry> entries = this.raw().getEntries(Storage.IS_JSON);
        entries.add(new Storage.StorageEntry("None", null));
        return entries;
    }

    public String toString() {
        return "{folder=" + this.folder + ", selected=" + this.selected + "}";
    }

    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getSelected() {
        return this.selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
}

