package com.mastercard.gadgetshop.util;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.mastercard.gadgetshop.GadgetShopApplication;
import com.mastercard.gadgetshop.R;

/**
 * Created by diego.rotondale on 09/09/2014.
 * Copyright (c) 2015 AnyPresence, Inc. All rights reserved.
 */
public class ImageUtil {

    private static final String LOG_TAG = ImageUtil.class.getSimpleName();

    public static void setImageUrl(NetworkImageView imageView, String imageUrl) {
        imageView.setErrorImageResId(R.drawable.ic_no_image);
        imageView.setDefaultImageResId(R.drawable.ic_image);
        ImageLoader imageLoader = GadgetShopApplication.getInstance().getImageLoader();
        imageView.setImageUrl(imageUrl, imageLoader);
    }
}


