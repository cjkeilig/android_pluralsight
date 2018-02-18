package com.example.unouser.notekeeper;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.ParcelableSparseArray;

/**
 * Created by Jim.
 */

public final class ModuleInfo implements Parcelable {
    private final String mModuleId;
    private final String mTitle;
    private boolean mIsComplete = false;

    public ModuleInfo(String moduleId, String title) {
        this(moduleId, title, false);
    }

    public ModuleInfo(String moduleId, String title, boolean isComplete) {
        mModuleId = moduleId;
        mTitle = title;
        mIsComplete = isComplete;
    }

    private ModuleInfo(Parcel source)
    {
        mModuleId = source.readString();
        mTitle = source.readString();
        mIsComplete = source.readString() == "true" ? true : false;
    }

    public String getModuleId() {
        return mModuleId;
    }

    public String getTitle() {
        return mTitle;
    }

    public boolean isComplete() {
        return mIsComplete;
    }

    public void setComplete(boolean complete) {
        mIsComplete = complete;
    }

    @Override
    public String toString() {
        return mTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModuleInfo that = (ModuleInfo) o;

        return mModuleId.equals(that.mModuleId);
    }

    @Override
    public int hashCode() {
        return mModuleId.hashCode();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mModuleId);
        parcel.writeString(mTitle);
        parcel.writeString(mIsComplete ? "true" : "false");
    }

    public final static Parcelable.Creator<ModuleInfo> CREATOR =
            new Parcelable.Creator<ModuleInfo>() {

                @Override
                public ModuleInfo createFromParcel(Parcel source){
                    return new ModuleInfo(source);
                }

                @Override
                public ModuleInfo[] newArray(int size) {
                    return new ModuleInfo[size];
                }
            };


}
