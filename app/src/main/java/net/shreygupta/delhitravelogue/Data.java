package net.shreygupta.delhitravelogue;

public class Data {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mDescription;
    private String mContact;
    private String mAddress;
    private String mTiming;
    private String mPrice;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Data(int imageResourceId, String name, String desc, String address, String timing, String price, String contact) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDescription = desc;
        mAddress = address;
        mTiming = timing;
        mPrice = price;
        mContact = contact;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public String getTiming() {
        return mTiming;
    }

    public boolean hasTiming() {
        return getTiming() != null;
    }

    public String getPrice() {
        return mPrice;
    }

    public boolean hasPrice() {
        return getPrice() != null;
    }

    public String getContact() {
        return mContact;
    }

    public boolean hasContact() {
        return getContact() != null;
    }
}