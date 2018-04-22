package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Image resource for the word
     */
    private int mImageWordId = NO_IMAGE_PROVIDED;
    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * Create a new com.example.android.miwok.Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new com.example.android.miwok.WordImages object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageWordId        is the image of the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageWordId, int audioResourceId) {
        mImageWordId = imageWordId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image for the word.
     */
    public int getImageWordId() {
        return mImageWordId;
    }

    /**
     * +     * Returns whether or not there is an image for this word.
     * +
     */
    public boolean hasImage() {
        return mImageWordId != NO_IMAGE_PROVIDED;
    }


    /**
     +     * Return the audio resource ID of the word.
     +     */
    public int getAudioResourceId() {
        return mAudioResourceId;
        }
}