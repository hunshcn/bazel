// Copyright 2021 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package com.google.devtools.build.lib.bazel.bzlmod;

import java.net.URISyntaxException;

/** A factory type for {@link Registry}. */
public interface RegistryFactory {

  /** Returns the unique registry associated with the given URL. */
  Registry getRegistryWithUrl(String url) throws URISyntaxException;

  /** Returns the unique registry associated with the given URL after resolving it. */
  Registry getRegistryWithUrl(String url, String workspacePath) throws URISyntaxException;
}
