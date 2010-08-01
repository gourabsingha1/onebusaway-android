/*
 * Copyright (C) 2010 Paul Watts (paulcwatts@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.joulespersecond.oba.request;

import com.joulespersecond.oba.elements.ObaAgency;
import com.joulespersecond.oba.elements.ObaReferences;
import com.joulespersecond.oba.elements.ObaRoute;
import com.joulespersecond.oba.elements.ObaStop;
import com.joulespersecond.oba.elements.ObaTrip;

import java.util.List;

public abstract class ObaResponseWithRefs extends ObaResponse implements ObaReferences {
    @Override
    public ObaStop getStop(String id) {
        return getRefs().getStop(id);
    }

    @Override
    public List<ObaStop> getStops(String[] ids) {
        return getRefs().getStops(ids);
    }

    @Override
    public ObaRoute getRoute(String id) {
        return getRefs().getRoute(id);
    }

    @Override
    public List<ObaRoute> getRoutes(String[] ids) {
        return getRefs().getRoutes(ids);
    }

    @Override
    public ObaTrip getTrip(String id) {
        return getRefs().getTrip(id);
    }

    @Override
    public List<ObaTrip> getTrips(String[] ids) {
        return getRefs().getTrips(ids);
    }

    @Override
    public ObaAgency getAgency(String id) {
        return getRefs().getAgency(id);
    }

    @Override
    public List<ObaAgency> getAgencies(String[] ids) {
        return getRefs().getAgencies(ids);
    }

    abstract protected ObaReferences getRefs();
}
