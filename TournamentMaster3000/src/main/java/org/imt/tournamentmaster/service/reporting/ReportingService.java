package org.imt.tournamentmaster.service.reporting;

import org.imt.tournamentmaster.model.match.Match;

import java.io.IOException;

public interface ReportingService {

    String report(Match match) throws IOException;
}
