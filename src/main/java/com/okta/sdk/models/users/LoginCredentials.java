/*!
 * Copyright (c) 2015-2017, Okta, Inc. and/or its affiliates. All rights reserved.
 * The Okta software accompanied by this notice is provided pursuant to the Apache License, Version 2.0 (the "License.")
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.okta.sdk.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.okta.sdk.framework.ApiObject;

public class LoginCredentials extends ApiObject {

    /**
     * Password object.
     */
    private Password password;

    /**
     * Recovery question object.
     */
    @JsonProperty(value = "recovery_question")
    private RecoveryQuestion recoveryQuestion;

    /**
     * Provider who stores the login credentials.
     */
    private Provider provider;

    /**
     * Returns the password.
     * @return {@link Password}
     */
    public Password getPassword() {
        return this.password;
    }

    /**
     * Sets the password.
     * @param val {@link Password}
     */
    public void setPassword(Password val) {
        this.password = val;
    }

    /**
     * Returns the recoveryQuestion.
     * @return {@link RecoveryQuestion}
     */
    public RecoveryQuestion getRecoveryQuestion() {
        return this.recoveryQuestion;
    }

    /**
     * Sets the recoveryQuestion.
     * @param val {@link RecoveryQuestion}
     */
    public void setRecoveryQuestion(RecoveryQuestion val) {
        this.recoveryQuestion = val;
    }

    /**
     * Returns the provider.
     * @return {@link Provider}
     */
    public Provider getProvider() {
        return this.provider;
    }

    /**
     * Sets the provider.
     * @param val {@link Provider}
     */
    public void setProvider(Provider val) {
        this.provider = val;
    }
}
