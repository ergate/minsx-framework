/*
 *
 *  * Copyright 2017 https://www.minsx.com
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.minsx.framework.security.api.listener;

import com.minsx.framework.security.api.authentication.Authentication;

import javax.servlet.http.HttpServletRequest;

public class LoginSuccessEvent extends AbstractAuthenticationEvent {

    private Authentication authentication;

    public LoginSuccessEvent(Authentication authentication, HttpServletRequest request) {
        super(request);
        this.authentication = authentication;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }
}
