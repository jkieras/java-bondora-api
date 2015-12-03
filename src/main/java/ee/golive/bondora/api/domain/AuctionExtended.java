/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ee.golive.bondora.api.domain;

import java.util.List;

/**
 * @author Taavi Ilves, Golive O�, http://www.golive.ee/
 */
public class AuctionExtended extends Auction {

    private List<Liability> liabilities;
    private List<Debt> depts;

    public List<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public List<Debt> getDepts() {
        return depts;
    }

    public void setDepts(List<Debt> depts) {
        this.depts = depts;
    }
}