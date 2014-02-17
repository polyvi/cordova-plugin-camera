
/*
 Copyright 2012-2013, Polyvi Inc. (http://polyvi.github.io/openxface)
 This program is distributed under the terms of the GNU General Public License.

 This file is part of xFace.

 xFace is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 xFace is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with xFace.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.apache.cordova.camera;

import com.polyvi.xface.util.XStrings;

import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ImageCroppingView extends RelativeLayout {
    // 保存和取消按钮名称
    private static String CROP_SAVE_TEXT = "crop_save_text";
    private static String CROP_DISCARD_TEXT = "crop_discard_text";

    private CropImageView mCropImageView;
    private Button mSaveButton;
    private Button mCancelButton;

    public ImageCroppingView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        RelativeLayout croppImageLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        this.addView(croppImageLayout, params);
        mCropImageView = new CropImageView(context);
        croppImageLayout.addView(mCropImageView, params);
        RelativeLayout buttonLayout = new RelativeLayout(context);
        params = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        params.leftMargin = 10;
        params.rightMargin = 10;
        params.bottomMargin = 10;
        this.addView(buttonLayout, params);
        mSaveButton = new Button(context);
        mSaveButton.setTextSize(10);
        mSaveButton.setText(XStrings.getInstance().getString(
                CROP_SAVE_TEXT));
        params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        buttonLayout.addView(mSaveButton, params);
        mCancelButton = new Button(context);
        mCancelButton.setTextSize(10);
        mCancelButton.setText(XStrings.getInstance().getString(
                CROP_DISCARD_TEXT));
        params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        buttonLayout.addView(mCancelButton, params);
    }

    public CropImageView getCropImageView() {
        return mCropImageView;
    }

    public Button getSaveButton() {
        return mSaveButton;
    }

    public Button getCancelButton() {
        return mCancelButton;
    }

}
