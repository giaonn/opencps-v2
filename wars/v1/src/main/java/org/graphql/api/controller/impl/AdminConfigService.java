package org.graphql.api.controller.impl;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.graphql.api.controller.adminconfig.crud.GetAdminConfig;
import org.graphql.api.controller.adminconfig.crud.GetDynamicReport;
import org.graphql.api.controller.adminconfig.crud.GetDynamicReports;
import org.graphql.api.controller.adminconfig.crud.UpdateDynamicReport;
import org.graphql.api.controller.utils.GraphQLUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

/**
 * Created binhth
 */
@Service
public class AdminConfigService {

	@Autowired
	private GetAdminConfig getAdminConfig;
	@Autowired
	private GetDynamicReports getDynamicReports;
	@Autowired
	private GetDynamicReport getDynamicReport;
	@Autowired
	private UpdateDynamicReport updateDynamicReport;
	
	private GraphQL graphQL;

	@PostConstruct
	public void loadGraphQLSchema() throws IOException {

		//String schema = StringPool.BLANK;

		String schema = GraphQLUtils.readGrapQL("adminconfig.graphql");

		TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(Validator.isNotNull(schema) ? schema : StringPool.BLANK);
		RuntimeWiring runtimeWiring = initWiring();
		GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);

		graphQL = GraphQL.newGraphQL(graphQLSchema).build();
	}

	private RuntimeWiring initWiring() {

//		MutationWiring mutationWiring = new MutationWiring();
		
		return RuntimeWiring.newRuntimeWiring()
				.type("Query",
						typeWiring -> typeWiring.dataFetcher("getAdminConfig", getAdminConfig)
						.dataFetcher("getDynamicReports", getDynamicReports)
						.dataFetcher("getDynamicReport", getDynamicReport)
				)
				.type("Mutation", typeWiring -> typeWiring.dataFetcher("updateDynamicReport", updateDynamicReport)
				)
				.build();
	}

	public GraphQL getGraphQL() {
		return graphQL;
	}
}
