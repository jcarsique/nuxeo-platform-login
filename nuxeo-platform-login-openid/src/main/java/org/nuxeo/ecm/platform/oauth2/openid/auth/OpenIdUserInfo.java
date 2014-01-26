/*
 * (C) Copyright 2006-2013 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Nelson Silva <nelson.silva@inevo.pt> - initial API and implementation
 *     Nuxeo
 */

package org.nuxeo.ecm.platform.oauth2.openid.auth;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/**
 * https://www.googleapis.com/auth/userinfo.email
 * https://www.googleapis.com/oauth2/v1/tokeninfo
 */
public class OpenIdUserInfo extends GenericJson {

    @Key("email")
    public String email;

    @Key("verified_email")
    public Boolean verifiedEmail;

    @Key("user_id")
    public String userId;

    @Key
    public String scope;
}
