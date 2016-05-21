/*
 * Copyright 2014 - 2016 Michael Rapp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package de.mrapp.android.dialog.model;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Defines the interface of a decorator, which allows to modify the view hierarchy of a dialog,
 * which is designed according to Android 5's Material Design guidelines even on pre-Lollipop
 * devices and may contain a header, must implement.
 *
 * @author Michael Rapp
 * @since 3.2.0
 */
public interface HeaderDialogDecorator extends Dialog {

    /**
     * Returns, whether the dialog's header is shown, or not.
     *
     * @return True, if the dialog's header is shown, false otherwise
     */
    boolean isHeaderShown();

    /**
     * Sets, whether the dialog's header should be shown, or not.
     *
     * @param show
     *         True, if the dialog's header should be shown, false otherwise
     */
    void showHeader(boolean show);

    /**
     * Returns the height of the dialog's header.
     *
     * @return The height of the dialog's header in pixels as an {@link Integer} value
     */
    int getHeaderHeight();

    /**
     * Sets the height of the dialog's header.
     *
     * @param height
     *         The height, which should be set, in pixels as an {@link Integer} value. The height
     *         must be at least 0
     */
    void setHeaderHeight(int height);

    /**
     * Returns the background of the dialog's header.
     *
     * @return The background of the dialog's header as an instance of the class {@link Drawable}
     */
    Drawable getHeaderBackground();

    /**
     * Sets the background color of the dialog's header.
     *
     * @param color
     *         The background color, which should be set, as an {@link Integer} value
     */
    void setHeaderBackgroundColor(@ColorInt int color);

    /**
     * Sets the background of the dialog's header.
     *
     * @param resourceId
     *         The resource id of the background, which should be set, as an {@link Integer} value.
     *         The resource id must correspond to a valid drawable resource
     */
    void setHeaderBackground(@DrawableRes int resourceId);

    /**
     * Sets the background of the dialog's header.
     *
     * @param background
     *         The background, which should be set, as an instance of the class {@link Drawable}.
     *         The background may not be null
     */
    void setHeaderBackground(@NonNull Drawable background);

    /**
     * Returns the icon of the dialog's header.
     *
     * @return The icon of the dialog's header as an instance of the class {@link Drawable} or null,
     * if no icon has been set
     */
    Drawable getHeaderIcon();

    /**
     * Sets the icon of the dialog's header.
     *
     * @param resourceId
     *         The resource id of the icon, which should be set, as an {@link Integer} value. The
     *         resource id must correspond to a valid drawable resource
     */
    void setHeaderIcon(@DrawableRes int resourceId);

    /**
     * Sets the icon of the dialog's header.
     *
     * @param icon
     *         The icon, which should be set, as an instance of the class {@link Drawable} or null,
     *         if no icon should be set
     */
    void setHeaderIcon(@Nullable Drawable icon);

    /**
     * Returns the color of the divider of the dialog's header.
     *
     * @return The color of the divider of the dialog's header as an {@link Integer} value
     */
    int getHeaderDividerColor();

    /**
     * Sets the color of the divider of the dialog's header.
     *
     * @param color
     *         The color, which should be set, as an {@link Integer} value
     */
    void setHeaderDividerColor(@ColorInt int color);

    /**
     * Returns, whether the divider of the dialog's header is shown, or not.
     *
     * @return True, if the divider of the dialog's header is shown, false otherwise
     */
    boolean isHeaderDividerShown();

    /**
     * Sets, whether the divider of the dialog's header should be shown, or not.
     *
     * @param show
     *         True, if the divider of the dialog's header should be shown, false otherwise
     */
    void showHeaderDivider(boolean show);

}