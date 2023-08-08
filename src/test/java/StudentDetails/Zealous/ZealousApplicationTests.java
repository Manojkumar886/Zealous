		package StudentDetails.Zealous;


		import org.junit.Assert;
		import org.junit.jupiter.api.Test;
		import org.junit.runner.RunWith;
		import org.mockito.Mockito;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.test.context.junit4.SpringRunner;

		import java.util.Optional;
		import java.util.stream.Collectors;
		import java.util.stream.Stream;

		@SpringBootTest
		@RunWith(SpringRunner.class)
		class ZealousApplicationTests
		{
			@Autowired
			ZealousStudentRepository repo;

			@Autowired
			ZealousStudentService service;

			@Test
			public void testcase()
			{
//				Assert.assertNull(service.Listallvalus());
				ZealousStudent student1=new ZealousStudent(1001,"Manojkumar","Namakkal",886,449);
				Mockito.when(repo.findAll()).thenReturn(Stream.of(student1).collect(Collectors.toList()));
				Assert.assertSame(student1.getStudentRegno(),service.Listallvalus().get(0));
			}

		}