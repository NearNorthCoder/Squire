/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.util;

import java.io.File;

public static class Storage.StorageEntry {
    private String name;
    private File file;

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public File getFile() {
        return this.file;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Storage.StorageEntry)) {
            return false;
        }
        Storage.StorageEntry other = (Storage.StorageEntry)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        File this$file = this.getFile();
        File other$file = other.getFile();
        return !(this$file == null ? other$file != null : !((Object)this$file).equals(other$file));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Storage.StorageEntry;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        File $file = this.getFile();
        result = result * 59 + ($file == null ? 43 : ((Object)$file).hashCode());
        return result;
    }

    public Storage.StorageEntry(String name, File file) {
        this.name = name;
        this.file = file;
    }
}
