package org.imt.tournamentmaster.service.reporting;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.imt.tournamentmaster.model.match.Match;

import java.io.IOException;

public class JsonReportingService implements ReportingService {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String report(Match match) throws IOException {
        return objectMapper.writeValueAsString(match);
    }
}
