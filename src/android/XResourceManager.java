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

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/**
 * 图片资源的管理
 */
public class XResourceManager {

	protected static XResourceManager instance = null;
	private static Activity mActivity;

	public static XResourceManager getInstance() {
		if (instance == null) {
			instance = new XResourceManager();
		}
		return instance;
	}

	public static void init(Activity activity) {
		mActivity = activity;
	}

	public Drawable getCameraCropWidthResource(Resources res) {
		return res.getDrawable(mActivity.getResources().getIdentifier(
				"camera_crop_width", "drawable", mActivity.getPackageName()));
	}

	public Drawable getCameraCropHeightResource(Resources res) {
		return res.getDrawable(mActivity.getResources().getIdentifier(
				"camera_crop_height", "drawable", mActivity.getPackageName()));
	}

	public Drawable getCameraCropIndicatorResource(Resources res) {
		return res.getDrawable(mActivity.getResources().getIdentifier(
				"indicator_autocrop", "drawable", mActivity.getPackageName()));
	}
}
