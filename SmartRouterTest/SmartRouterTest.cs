using System;
using SmartRouter;
using Xunit;

namespace SmartRouterTest
{
    public class UnitTest1
    {
        [Fact]
        public void Smart_Router_Hello_World()
        {
            SmartRouterInit sr = new SmartRouterInit();
            Assert.True(sr.HelloWorld());
        }
    }
}