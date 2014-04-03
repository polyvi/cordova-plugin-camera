<!--
#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
#  KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#
-->
# Release Note X


### 0.2.6 Mon Jan 27 2014 16:41:10 GMT+0800 (CST)
 *  added releasenotex.md
 *  CB-5719 Updated version and RELEASENOTES.md for release 0.2.6
 *  CB-5658 Update license comment formatting of doc/index.md
 *  CB-5658 Add doc.index.md for Camera plugin
 *  CB-5658 Delete stale snapshot of plugin docs
 *  [iOS] Added cropToSize option to allow users to resize image and crop to target size
 *  add .reviewboardrc
 *  CB-2442 CB-2419 Use Windows.Storage.ApplicationData.current.localFolder, instead of writing to app package.
 *  [BlackBerry10] Adding platform level permissions
 *  CB-5599 Android: Catch and ignore OutOfMemoryError in getRotatedBitmap()
 *  [CB-5565] Incremented plugin version on dev branch.
 *  [CB-5565] Updated version and RELEASENOTES.md for release 0.2.5
 *  fix camera for firefox os
 *  getPicture via web activities
 *  [ubuntu] specify policy_group
 *  add ubuntu platform
 *  1. User Agent detection now detects AmazonWebView. 2. Change to use amazon-fireos as the platform if user agent string contains 'cordova-amazon-fireos'
 *  Added amazon-fireos platform.
 *  batch modify .reviewboard
 *  sync cordova-mobile-spec into camera


## 0.2.8 (Fri Feb 28 2014)


 *  Revert test
 *  CB-5980 Updated version and RELEASENOTES.md for release 0.2.7
 *  remove unrequired FFOS file
 *  reapply new version of FFOS config in plugin.xml
 *  remove 2nd FFOS platform config in plugin.xml
 *  typo
 *  CB-4919 firefox os quirks added and supported platforms list is updated
 *  getPicture via web activities
 *  Documented quirk for CB-5335 + CB-5206 for WP7+8
 *  reference the correct firefoxos implementation
 *  Delete stale test/ directory
 *  [BlackBerry10] Add permission to access_shared
 *  CB-5719 Incremented plugin version on dev branch.
 *  Documented quirk for CB-5335 + CB-5206 for WP7+8
 *  CB-5719 Updated version and RELEASENOTES.md for release 0.2.6
 *  CB-5658 Update license comment formatting of doc/index.md
 *  CB-5658 Add doc.index.md for Camera plugin
 *  CB-5658 Delete stale snapshot of plugin docs
 *  [Android]Camera crop photos fixed codes error
 *  [android]Add crop photos feature into cordova-plugin-camera


## 0.2.9 (Thu Apr 03 2014)


 *  fix the xfaceLib is not can read the picture info
 *  issue 8 xFace Camera:crashed when clicked the 2nd,4th,5th,8th,9th button to take pictures. Bug reason:Views with LAYER_TYPE_SOFTWARE should be drawn with software when Manifest android:hardwareAccelerated=true Solution:verified via canvas.isHardwareAccelerated() to skip canvas.clipPath
 *  issue 7：Sync cordova tests
 *  Incremented plugin version on dev branch to 0.2.9-dev
