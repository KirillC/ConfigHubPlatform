/*
 * This file is part of ConfigHub.
 *
 * ConfigHub is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ConfigHub is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ConfigHub.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.confighub.api.server;

import com.confighub.api.util.ServiceConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Initializer
        implements ServletContextListener
{
    private static final Logger log = LogManager.getLogger("Initializer");

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        ServiceConfiguration serviceConfiguration = ServiceConfiguration.getInstance();
        log.info("ConfigHub Version: " + serviceConfiguration.getVersion());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
    }
}
