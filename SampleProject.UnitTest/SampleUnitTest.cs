using Xunit;

namespace SampleProject.UnitTest
{
    public class SampleUnitTest
    {
        [Fact]
        public void Smart_Router_Hello_World()
        {
            Sample sr = new Sample();
            Assert.True(sr.HelloWorld());
        }
    }
}